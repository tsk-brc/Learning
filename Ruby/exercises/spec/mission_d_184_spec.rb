require './app/mission_d_184.rb'

describe '時給計算チェック' do
  describe '出力結果のテスト' do
    let(:missionD184) { MissionD184.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "7\n", "program\n"
      expect { missionD184.run }.to output("p\nr\no\ng\nr\na\nm\n").to_stdout
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "1\n", "a\n"
      expect { missionD184.run }.to output("a\n").to_stdout
    end
  end
end
