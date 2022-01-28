require './app/mission_c_104.rb'

describe '空式チェック' do
  describe '出力結果のテスト' do
    before { allow($stdout).to receive(:puts) }
    let(:missionC104) { MissionC104.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "4 1\n"
      expect { missionC104.run }.to output("4 9\n").to_stdout
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "3 7\n"
      expect { missionC104.run }.to output("No\n").to_stdout
    end
  end
end
