require './app/mission_d_178.rb'

describe '文字列逆順チェック' do
  describe '出力結果のテスト' do
    let(:missionD178) { MissionD178.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "11\n", "programming\n"
      expect($stdout).to receive(:puts).with('gnimmargorp')
      missionD178.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "3\n", "ABC\n"
      expect($stdout).to receive(:puts).with('CBA')
      missionD178.run
    end
  end
end
