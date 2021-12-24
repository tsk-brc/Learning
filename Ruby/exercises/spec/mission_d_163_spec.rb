require './app/mission_d_163.rb'

describe '文字列縦書き出力チェック' do
  describe '出力結果のテスト' do
    let(:missionD163) { MissionD163.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "Pizza\n" }
      expect { missionD163.run }.to output("P\ni\nz\nz\na\n").to_stdout
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "ABC\n" }
      expect { missionD163.run }.to output("A\nB\nC\n").to_stdout
    end
  end
end
